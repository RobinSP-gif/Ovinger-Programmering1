public class Matrise {
    private final int[][] data; //Matrise element

    public Matrise(int[][] input) {

        int antallKolonner = input[0].length;

        for (int i = 1; i < input.length; i++) {
            if (input[i].length != antallKolonner) {
                throw new IllegalArgumentException("Ugyldig matrise: radene har ulik lengde");
            }
        }

        data = new int[input.length][input[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                data[i][j] = input[i][j];
            }
        }
    }

    public Matrise add(Matrise annen){
        if (this.data.length != annen.data.length || this.data[0].length != annen.data[0].length){
            return null;
        }

        int [][] resultat = new int[data.length][data[0].length];
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++){
                resultat [i][j] = this.data[i][j] + annen.data[i][j];
            }
        }
        return new Matrise(resultat);
    }

    public Matrise multiply(Matrise annen){
        if (this.data[0].length != annen.data.length){
            return null;
        }

        int rad = this.data.length;
        int kolonner = annen.data[0].length;
        int felles = this.data[0].length;

        int [][] resultat = new int[rad][kolonner];

        for (int i = 0; i < rad; i++){
            for (int j = 0; j < kolonner; j++){
                for (int k = 0; k < felles; k++){
                    resultat [i][j] += this.data[i][k] * annen.data[k][j];
                }
            }

         }
        return new Matrise(resultat);
    }

    public Matrise transponering() {
        int [][] transponertMatrise = new int[this.data[0].length][this.data.length];

        for (int i = 0; i < this.data.length; i++){
            for (int j = 0; j < this.data[0].length; j++){
                transponertMatrise [j] [i] = this.data[i][j];
            }
        }

        return new Matrise(transponertMatrise);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sb.append(data[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}