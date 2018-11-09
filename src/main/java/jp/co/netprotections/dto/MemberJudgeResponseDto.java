package jp.co.netprotections.dto;

public class MemberJudgeResponseDto {

  private String memberName;
  private boolean enlistedPropriety;

  public void setString(String string) {
    this.memberName = string;
  }

  public String getString() {
    return memberName;
  }

  public void setenlistedPropriety(boolean propriety) {
    this.enlistedPropriety = propriety;
  }
}
