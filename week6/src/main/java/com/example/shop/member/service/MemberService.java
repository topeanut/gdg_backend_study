package com.example.shop.member.service;

import com.example.shop.member.dto.MemberCreateRequest;
import com.example.shop.member.dto.MemberUpdateRequest;
import com.example.shop.member.entity.Member;

import java.util.List;

public interface MemberService {
    Long createMember(MemberCreateRequest request);
    List<Member> getAllMembers();
    Member getMemberById(Long id);
    void updateMember(Long id, MemberUpdateRequest request);
    void deleteMember(Long id);
}





