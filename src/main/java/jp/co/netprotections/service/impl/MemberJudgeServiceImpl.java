package jp.co.netprotections.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;

@Service
public class MemberJudgeServiceImpl implements MemberJudgeService {

  @ResponseBody
  public MemberJudgeResponseDto execute(MemberJudgeRequestDto dto) {
    MemberJudgeResponseDto judge = new MemberJudgeResponseDto();
    judge.setmemberName(dto.getMemberName());
    judge.setenlistedPropriety(judgeLogic(dto));

    return judge;
  }




  public boolean judgeLogic(MemberJudgeRequestDto dto) {

    if(dto.getEventPlanning() > 1
        &&
        dto.getCoodination() > 1
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
    sum.getEventPlanning()
      +
    sum.getCoodination()
      +
    sum.getCogitation()
      +
    sum.getProgrammingAbility()
      +
    sum.getInfrastructureKnowledge();
  }

}
