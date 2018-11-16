package jp.co.netprotections.dto;

import java.util.List;


/**
 * http://m-shige1979.hatenablog.com/entry/2016/12/26/080000
 * @author k.yamaura
 */

public class MemberJudgeRequestsDto {
  private List<MemberJudgeRequestDto> memberCandidatesList;

  public List<MemberJudgeRequestDto> getMemberCandidatesList() {
    return memberCandidatesList;
  }

  public void setMemberCandidatesList(List<MemberJudgeRequestDto> memberCandidatesList) {
    this.memberCandidatesList = memberCandidatesList;
  }

  public String toStrings() {
    String str = "";
    for (MemberJudgeRequestDto memberCandidate : this.memberCandidatesList) {
      str += memberCandidate.toStrings() + "\n";
    }
    return str;
  }




}
