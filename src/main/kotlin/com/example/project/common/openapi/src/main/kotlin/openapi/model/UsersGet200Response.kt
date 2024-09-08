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
 * @param userId 
 * @param email 
 * @param password 
 * @param name 
 * @param roleType 
 */
data class UsersGet200Response(

    @Schema(example = "U0000000000", description = "")
    @field:JsonProperty("userId") val userId: kotlin.String? = null,

    @Schema(example = "hoge@example.com", description = "")
    @field:JsonProperty("email") val email: kotlin.String? = null,

    @Schema(example = "*******", description = "")
    @field:JsonProperty("password") val password: kotlin.String? = null,

    @Schema(example = "hoge", description = "")
    @field:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "ADMIN", description = "")
    @field:JsonProperty("roleType") val roleType: kotlin.String? = null
) {

}

