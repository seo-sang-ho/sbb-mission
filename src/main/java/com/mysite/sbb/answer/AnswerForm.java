package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AnswerForm {
    @NotEmpty(message = "메세지를 입력해야합니다.")
    private String content;
}
