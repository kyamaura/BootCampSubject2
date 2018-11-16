package jp.co.netprotections.controller;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

@RunWith(JUnit4.class)
public class MemberJudgeControllerTest {


  @Test
  public void test001controller() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.setMemberName("nozaki");
    dto.setEventPlanning(3);
    dto.setCogitation(3);
    dto.setCoodination(2);
    dto.setProgrammingAbility(2);
    dto.setInfrastructureKnowledge(2);
    MemberJudgeController memberJudgeController = new MemberJudgeController();
    MemberJudgeResponseDto controllerTest001 = memberJudgeController.execute(dto);
    assertThat(controllerTest001.getmemberName(), is("nozaki"));
    assertThat(controllerTest001.getenlistedPropriety(), is(true));

  }

}
