package com.company.goodreadsapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddReviewCommand {
    @NotNull
    private Long userId;
    @NotNull
    private Long bookId;
    @NotNull
    private String readStatus;


}