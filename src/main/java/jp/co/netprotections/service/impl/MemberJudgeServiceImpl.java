package jp.co.netprotections.service.impl;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

public class MemberJudgeServiceImpl {

  public boolean judgeLogic(MemberJudgeRequestDto dto) {

    if(dto.geteventPlanning() > 1
        &&
        dto.getcoodination() > 1
        &&
        sum(dto) > 10
    ) {
      return true;
    } else {
      return false;
    }
  }

  public int sum(MemberJudgeRequestDto sum) {
    return
    sum.geteventPlanning()
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
