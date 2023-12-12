package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.requests.UpdateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.GetByIdModelResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.concretes.Model;

public class ModelManager implements ModelService {

	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllModelsResponse> getAll() {
		
		List<ch.qos.logback.core.model.Model> models=modelRepository.findAll();
		
		List<GetAllModelsResponse> modelsResponse=models.stream()
				.map(model -> this.modelMapperService.forResponse().map(models,GetAllModelsResponse.class))
				.collect(Collectors.toList());
		
		return modelsResponse;
	}

	@Override
	public GetByIdModelResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model =this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		
	}

	@Override
	public void update(UpdateModelRequest updateModelRequest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
