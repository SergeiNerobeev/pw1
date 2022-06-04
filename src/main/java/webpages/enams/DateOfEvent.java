package webpages.enams;

public enum DateOfEvent {
JUNE2("2 июня"),JUNE6("6 июня"),JUNE7("7 июня"),JUNE8("8 июня"),JUNE9("9 июня"),JUNE14("14 июня"),JUNE15("15 июня"),JUNE16("16 июня"),
JUNE20("20 июня"),JUNE21("21 июня"),JUNE22("22 июня"),JUNE23("23 июня"),JUNE28("28 июня"),JUNE30("30 июня");
private String dateOfEvent;
private boolean eqDates;

  DateOfEvent(String dateOfEvent) {
    this.dateOfEvent = dateOfEvent;
  }

  public String getDateOfEvent() {
    return dateOfEvent;
  }
}
