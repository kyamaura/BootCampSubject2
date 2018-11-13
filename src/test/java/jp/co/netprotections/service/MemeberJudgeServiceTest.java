package jp.co.netprotections.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;
@RunWith(JUnit4.class)
public class MemeberJudgeServiceTest {

  @Test
  public void testImpl001() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.seteventPlanning(5);
    dto.setcoodination(5);
    dto.setcogitation(5);
    dto.setprogrammingAbility(5);
    dto.setinfrastructureKnowledge(5);
    MemberJudgeServiceImpl first = new MemberJudgeServiceImpl();
    boolean result = first.judgeLogic(dto);
    assertThat(result, is(true));
  }

  @Test
  public void testImpl002() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.seteventPlanning(1);
    dto.setcoodination(5);
    dto.setcogitation(5);
    dto.setprogrammingAbility(5);
    dto.setinfrastructureKnowledge(5);
    MemberJudgeServiceImpl second = new MemberJudgeServiceImpl();
    boolean result = second.judgeLogic(dto);
    assertThat(result, is(false));
  }

  @Test
  public void testService001() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.setmemberName("nozaki");
    dto.seteventPlanning(2);
    dto.setcogitation(3);
    dto.setcoodination(2);
    dto.setprogrammingAbility(2);
    dto.setinfrastructureKnowledge(2);
    MemberJudgeService third = new MemberJudgeService();
    MemberJudgeResponseDto result =  third.execute(dto);
    assertThat(result.getmemberName(), is("nozaki"));
    assertThat(result.getenlistedPropriety(), is(true));

  }

}
