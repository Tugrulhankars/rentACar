package kodlama.io.rentACar.business.requests;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

	private int modelYear;
	
	@NonNull
	@NotBlank
	@Size(min=3,max=30)
	private String modelName;
	
	private Double dailyPrice;
	
	private int modelId;
	
}
