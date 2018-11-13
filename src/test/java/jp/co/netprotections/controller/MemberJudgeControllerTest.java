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
    dto.setmemberName("nozaki");
    dto.seteventPlanning(4);
    dto.setcogitation(3);
    dto.setcoodination(2);
    dto.setprogrammingAbility(2);
    dto.setinfrastructureKnowledge(2);
    MemberJudgeController memberJudgeController = new MemberJudgeController();
    MemberJudgeResponseDto controllerTest001 = memberJudgeController.execute(dto);
    assertThat(controllerTest001.getmemberName(), is("nozak"));
    assertThat(controllerTest001.getenlistedPropriety(), is(true));

  }

}
