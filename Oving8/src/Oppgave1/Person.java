package Oppgave1;

public class Person {

  private final String fornavn;
  private final String mellomnavn;
  private final String etternavn;
  private final int fodselsaar;

  public Person(String fornavn, String etternavn, int fodselsaar) {
    this.fornavn = fornavn;
    this.mellomnavn = "";
    this.etternavn = etternavn;
    this.fodselsaar = fodselsaar;
  }

  public Person(String fornavn, String mellomnavn, String etternavn, int fodselsaar){
      this.fornavn = fornavn;
      this.mellomnavn = mellomnavn;
      this.etternavn = etternavn;
      this.fodselsaar = fodselsaar;
  }

  public String getFornavn() {
    return fornavn;
  }
  public String getMellomnavn() {
      return mellomnavn;
  }
  public String getEtternavn() {
        return etternavn;
    }

  public int getFodselsaar() {
    return fodselsaar;
  }

    @Override
    public String toString() {
        if (mellomnavn.isEmpty()) {
            return fornavn + " " + etternavn;
        } else {
            return fornavn + " " + mellomnavn + " " + etternavn;
        }
    }
}