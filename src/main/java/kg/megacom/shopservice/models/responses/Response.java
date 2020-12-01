package kg.megacom.shopservice.models.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private int status;
    private String message;
    private Object object;

    public static Response success(){
        return Response.builder()
                .status(1)
                .message("Успешно")
                .build();
    }


    public static Response error(){
        return Response.builder()
                .status(2)
                .message("Ошибка сохраниения в базу данных!!!")
                .build();
    }
}
