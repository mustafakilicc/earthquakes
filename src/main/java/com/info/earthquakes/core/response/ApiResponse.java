package com.info.earthquakes.core.response;


import com.info.earthquakes.core.dto.BaseDTO;
import com.info.earthquakes.core.enums.ResponseStatus;


public class ApiResponse<T extends BaseDTO> {
    private T body;
    private ResponseStatus responseStatus;

    public static <T extends BaseDTO> Builder<T> builder(){
        return new Builder<>();
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public static class Builder<T extends BaseDTO>{

        private ApiResponse<T> instance;

        public Builder(){
            instance = new ApiResponse<>();
        }

        public Builder<T> body(T body){
            this.instance.body = body;
            return this;
        }


        public Builder<T> success(){
            this.instance.responseStatus = ResponseStatus.SUCCESS;
            return this;
        }


        public Builder<T> error(){
            this.instance.responseStatus = ResponseStatus.ERROR;
            return this;
        }

        public ApiResponse<T> buildInstance(){
            return this.instance;
        }


    }
}
