package openapi.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param message 
 * @param statusCode 
 */
data class UsersGet400Response(

    @Schema(example = "bad request error", description = "")
    @field:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "400", description = "")
    @field:JsonProperty("statusCode") val statusCode: java.math.BigDecimal? = null
) {

}

