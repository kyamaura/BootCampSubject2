package jp.co.netprotections.dto;

public class MemberJudgeRequestDto {

  private String memberName;
  private int eventPlanning;
  private int cogitation;
  private int coodination;
  private int programmingAbility;
  private int infrastructureKnowledge;

  public String getString() {
    return memberName;
  }

  public int geteventPlanning() {
    return eventPlanning;
  }

  public int getcogitation() {
    return cogitation;
  }

  public int getcoodination() {
    return coodination;
  }

  public int getprogrammingAbility() {
    return programmingAbility;
  }

  public int getinfrastructureKnowledge() {
    return infrastructureKnowledge;
  }

  public void seteventPlanning(int eventPlanning) {
    this.eventPlanning = eventPlanning;
  }

  public void setcoodination(int coodination) {
    this.coodination = coodination;
  }

  public void setcogitation(int cogitation) {
    this.cogitation = cogitation;
  }

  public void setprogrammingAbility(int programmingAbility) {
    this.programmingAbility = programmingAbility;
  }

  public void setinfrastructureKnowledge(int infrastructureKnowledge) {
    this.infrastructureKnowledge = infrastructureKnowledge;
  }

}
