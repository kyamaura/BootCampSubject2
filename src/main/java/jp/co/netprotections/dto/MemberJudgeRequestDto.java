package jp.co.netprotections.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MemberJudgeRequestDto {

  private String memberName;
  private int eventPlanning;
  private int cogitation;
  private int coodination;
  private int programmingAbility;
  private int infrastructureKnowledge;

  public String getMemberName() {
    return memberName;
  }

  public int getEventPlanning() {
    return eventPlanning;
  }

  public int getCogitation() {
    return cogitation;
  }


  @NotNull
  @Min(0)
  @Max(5)
  public int getCoodination() {
    return coodination;
  }

  public int getProgrammingAbility() {
    return programmingAbility;
  }


  public int getInfrastructureKnowledge() {
    return infrastructureKnowledge;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public void setEventPlanning(int eventPlanning) {
    this.eventPlanning = eventPlanning;
  }

  public void setCoodination(int coodination) {
    this.coodination = coodination;
  }

  public void setCogitation(int cogitation) {
    this.cogitation = cogitation;
  }

  public void setProgrammingAbility(int programmingAbility) {
    this.programmingAbility = programmingAbility;
  }

  public void setInfrastructureKnowledge(int infrastructureKnowledge) {
    this.infrastructureKnowledge = infrastructureKnowledge;
  }

  public String toStrings() {
    return "memberName = " + getMemberName() + " eventPlanning = " + this.getEventPlanning();
  }

}
