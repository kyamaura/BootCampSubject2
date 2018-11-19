package jp.co.netprotections.service.impl;

import java.util.Comparator;

import jp.co.netprotections.dto.MemberJudgeResponseDto;

public class NewComp2 implements Comparator<MemberJudgeResponseDto> {
  /**
   *  java.util.Comparatorを実装します.
   */
  public int compare(MemberJudgeResponseDto list1, MemberJudgeResponseDto list2) {
    return Boolean.compare(list2.getenlistedPropriety(), list1.getenlistedPropriety());
  }

}
