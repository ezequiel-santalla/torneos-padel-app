package com.eze_dev.torneos.dto.update;

import com.eze_dev.torneos.types.TournamentStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentStatusUpdateDto {

    @NotNull(message = "New tournament status is required")
    private TournamentStatus status;
}

