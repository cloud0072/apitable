/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.apitable.databusclient.model.CommentMsg;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * Comments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Comments {
  public static final String SERIALIZED_NAME_COMMENT_ID = "commentId";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private String commentId;

  public static final String SERIALIZED_NAME_COMMENT_MSG = "commentMsg";
  @SerializedName(SERIALIZED_NAME_COMMENT_MSG)
  private CommentMsg commentMsg;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Long createdAt;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private Integer revision;

  public static final String SERIALIZED_NAME_UNIT_ID = "unitId";
  @SerializedName(SERIALIZED_NAME_UNIT_ID)
  private String unitId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private Long updatedAt;

  public Comments() {
  }

  public Comments commentId(String commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  @javax.annotation.Nonnull
  public String getCommentId() {
    return commentId;
  }


  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }


  public Comments commentMsg(CommentMsg commentMsg) {
    
    this.commentMsg = commentMsg;
    return this;
  }

   /**
   * Get commentMsg
   * @return commentMsg
  **/
  @javax.annotation.Nonnull
  public CommentMsg getCommentMsg() {
    return commentMsg;
  }


  public void setCommentMsg(CommentMsg commentMsg) {
    this.commentMsg = commentMsg;
  }


  public Comments createdAt(Long createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * minimum: 0
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public Long getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public Comments revision(Integer revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * minimum: 0
   * @return revision
  **/
  @javax.annotation.Nonnull
  public Integer getRevision() {
    return revision;
  }


  public void setRevision(Integer revision) {
    this.revision = revision;
  }


  public Comments unitId(String unitId) {
    
    this.unitId = unitId;
    return this;
  }

   /**
   * Get unitId
   * @return unitId
  **/
  @javax.annotation.Nonnull
  public String getUnitId() {
    return unitId;
  }


  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public Comments updatedAt(Long updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * minimum: 0
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public Long getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.commentId, comments.commentId) &&
        Objects.equals(this.commentMsg, comments.commentMsg) &&
        Objects.equals(this.createdAt, comments.createdAt) &&
        Objects.equals(this.revision, comments.revision) &&
        Objects.equals(this.unitId, comments.unitId) &&
        Objects.equals(this.updatedAt, comments.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commentMsg, createdAt, revision, unitId, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentMsg: ").append(toIndentedString(commentMsg)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("commentId");
    openapiFields.add("commentMsg");
    openapiFields.add("createdAt");
    openapiFields.add("revision");
    openapiFields.add("unitId");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("commentId");
    openapiRequiredFields.add("commentMsg");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("revision");
    openapiRequiredFields.add("unitId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Comments
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Comments.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Comments is not found in the empty JSON string", Comments.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Comments.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Comments` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Comments.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("commentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commentId").toString()));
      }
      // validate the required field `commentMsg`
      CommentMsg.validateJsonElement(jsonObj.get("commentMsg"));
      if (!jsonObj.get("unitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Comments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Comments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Comments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Comments.class));

       return (TypeAdapter<T>) new TypeAdapter<Comments>() {
           @Override
           public void write(JsonWriter out, Comments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Comments read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Comments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Comments
  * @throws IOException if the JSON string is invalid with respect to Comments
  */
  public static Comments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Comments.class);
  }

 /**
  * Convert an instance of Comments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

