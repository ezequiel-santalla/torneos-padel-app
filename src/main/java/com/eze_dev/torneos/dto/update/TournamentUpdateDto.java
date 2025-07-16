package com.eze_dev.torneos.dto.update;

import com.eze_dev.torneos.types.CategoryType;
import com.eze_dev.torneos.types.GenderType;
import com.eze_dev.torneos.types.TournamentType;
import com.eze_dev.torneos.types.WinningMatchRuleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentUpdateDto {

    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String address;

    private TournamentType tournamentType;

    private GenderType genderType;

    private CategoryType categoryType;

    private WinningMatchRuleType winningMatchRule;
}

