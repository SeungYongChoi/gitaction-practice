package gitaction.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    public void test() {
        Member member = new Member();
        member.setName("yong");

        Assertions.assertThat(member.getName()).isEqualTo("yong2");
    }

}