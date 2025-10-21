package com.example.shop.member;

import com.example.shop.member.dto.MemberCreateRequest;
import com.example.shop.member.dto.MemberUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.net.URI;

import java.util.List;

//@Controller// 컨트롤러 명시
//@ResponseBody // 반환값을 응답 본문에 직접 작성하게 해주는 어노테이션
@RestController // 위의 두 개 포함
@RequiredArgsConstructor // 모든 필드값을 파라미터로 받는 생성자 생성
// NoArgsConstructor 은 파라미터가 없는 디폴트 생성자
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Void> createMember(@RequestBody MemberCreateRequest request) {
        Long memberId = memberService.createMember(request);
        return ResponseEntity.created(URI.create("/members/" + memberId)).build();
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers(){
        List<Member> members = memberService.getAllMembers();
        return ResponseEntity.ok(members);
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<Member> getMember(@PathVariable Long memberId) {
        Member member = memberService.getMemberById(memberId);
        return ResponseEntity.ok(member);
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<Void> updateMember(
            @PathVariable Long memberId,
            @RequestBody MemberUpdateRequest request) {
        memberService.updateMember(memberId, request);
        return ResponseEntity.ok().build(); // 200 OK, body 없음
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}