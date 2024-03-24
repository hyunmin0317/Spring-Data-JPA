package study.datajpa.dto;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly2 {

    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
