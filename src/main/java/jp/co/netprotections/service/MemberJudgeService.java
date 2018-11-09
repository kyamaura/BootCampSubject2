package jp.co.netprotections.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

@Service
public class MemberJudgeService {
  @ResponseBody
  public MemberJudgeResponseDto execute(MemberJudgeRequestDto dto) {
    MemberJudgeResponseDto judge = new MemberJudgeResponseDto();
    judge.setString(dto.getString());
    if (dto.getcoodination() == 2) {
      judge.setenlistedPropriety(true);
    } else {
      judge.setenlistedPropriety(false);
    }

    return judge;

  }



}