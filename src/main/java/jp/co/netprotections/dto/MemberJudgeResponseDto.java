package jp.co.netprotections.dto;

public class MemberJudgeResponseDto {

  private String memberName;
  private boolean enlistedPropriety;

  public void setmemberName(String string) {
    this.memberName = string;
  }

  public String getmemberName() {
    return memberName;
  }

  public void setenlistedPropriety(boolean propriety) {
    this.enlistedPropriety = propriety;
  }

  public boolean getenlistedPropriety() {
    return enlistedPropriety;
  }

}
