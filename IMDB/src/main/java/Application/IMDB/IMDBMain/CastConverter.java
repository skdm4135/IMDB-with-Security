package Application.IMDB.IMDBMain;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
@Component
public class CastConverter implements AttributeConverter<List<IMDBCastEntity>, String> {

	@Override
	public String convertToDatabaseColumn(List<IMDBCastEntity> attribute) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(attribute);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<IMDBCastEntity> convertToEntityAttribute(String dbData) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(dbData, objectMapper.getTypeFactory().constructCollectionType(List.class, IMDBCastEntity.class));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
