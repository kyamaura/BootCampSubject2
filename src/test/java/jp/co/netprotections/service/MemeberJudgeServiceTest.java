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
    dto.setEventPlanning(5);
    dto.setCoodination(5);
    dto.setCogitation(5);
    dto.setProgrammingAbility(5);
    dto.setInfrastructureKnowledge(5);
    MemberJudgeServiceImpl first = new MemberJudgeServiceImpl();
    boolean result = first.judgeLogic(dto);
    assertThat(result, is(true));
  }

  @Test
  public void testImpl002() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.setEventPlanning(1);
    dto.setCoodination(5);
    dto.setCogitation(5);
    dto.setProgrammingAbility(5);
    dto.setInfrastructureKnowledge(5);
    MemberJudgeServiceImpl second = new MemberJudgeServiceImpl();
    boolean result = second.judgeLogic(dto);
    assertThat(result, is(false));
  }

  @Test
  public void testService001() {
    MemberJudgeRequestDto dto = new MemberJudgeRequestDto();
    dto.setMemberName("nozaki");
    dto.setEventPlanning(2);
    dto.setCogitation(3);
    dto.setCoodination(2);
    dto.setProgrammingAbility(2);
    dto.setInfrastructureKnowledge(2);
    MemberJudgeServiceImpl third = new MemberJudgeServiceImpl();
    MemberJudgeResponseDto result =  third.execute(dto);
    assertThat(result.getmemberName(), is("nozaki"));
    assertThat(result.getenlistedPropriety(), is(true));

  }

}
