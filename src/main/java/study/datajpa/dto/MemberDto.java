package study.datajpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import study.datajpa.entity.Member;

@Data
@Builder
@AllArgsConstructor
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public static MemberDto from(Member member) {
        return MemberDto.builder()
                .id(member.getId())
                .username(member.getUsername())
                .teamName(member.getTeam() != null ? member.getTeam().getName() : null)
                .build();
    }
}
