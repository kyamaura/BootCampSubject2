package jp.co.netprotections.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;
@RunWith(JUnit4.class)
public class MemeberJudgeServiceTest {

  @Test
  public void test001() {
    MemberJudgeServiceImpl first = new MemberJudgeServiceImpl();
    boolean result = first.judgeLogic();
    assertThat(result, is(true));
  }

  @Test
  public void test002() {
    MemberJudgeServiceImpl first = new MemberJudgeServiceImpl();
    boolean result = first.judgeLogic();
    assertThat(result, is(true));
  }
}
