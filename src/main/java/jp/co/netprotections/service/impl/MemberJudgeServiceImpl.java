package jp.co.netprotections.service.impl;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

public class MemberJudgeServiceImpl {
  public boolean judgeLogic() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.seteventPlanning(5);
    dto.setcoodination(5);
    dto.setcogitation(5);
    dto.setprogrammingAbility(5);
    dto.setinfrastructureKnowledge(5);
    if(dto.geteventPlanning() >= 2
        &&
        dto.getcoodination() >= 2
        &&
        sum(dto) >= 11
    ) {
      return true;
    } else {
      return false;
    }
  }

  public int sum(MemberJudgeRequestDto sum) {
    return sum.geteventPlanning()
      +
    sum.getcoodination()
      +
    sum.getcogitation()
      +
    sum.getprogrammingAbility()
      +
    sum.getinfrastructureKnowledge();
  }

}
