package jp.co.netprotections.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@Service
public class MemberJudgeService {

  @ResponseBody
  public MemberJudgeResponseDto execute(MemberJudgeRequestDto dto) {
      MemberJudgeResponseDto judge = new MemberJudgeResponseDto();
      judge.setmemberName(dto.getString());
      MemberJudgeServiceImpl memberJudgeServiceImpl = new MemberJudgeServiceImpl();
      judge.setenlistedPropriety(memberJudgeServiceImpl.judgeLogic(dto));

      return judge;
    }





}