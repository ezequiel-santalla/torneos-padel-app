package com.eze_dev.torneos.dto.response;

import com.eze_dev.torneos.types.TournamentStatus;
import com.eze_dev.torneos.types.TournamentType;
import com.eze_dev.torneos.types.WinningMatchRuleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentResponseDto {

    private UUID id;
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private TournamentType type;
    private TournamentStatus status;
    private WinningMatchRuleType winningMatchRule;
}

