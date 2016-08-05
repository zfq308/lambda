package com.digitalsanctum.lambda.server.service;

import com.amazonaws.services.lambda.model.CreateEventSourceMappingRequest;
import com.amazonaws.services.lambda.model.CreateEventSourceMappingResult;
import com.amazonaws.services.lambda.model.CreateFunctionResult;
import com.amazonaws.services.lambda.model.FunctionCodeLocation;
import com.amazonaws.services.lambda.model.FunctionConfiguration;
import com.amazonaws.services.lambda.model.GetFunctionResult;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.ListFunctionsResult;
import com.amazonaws.services.lambda.model.PublishVersionRequest;
import com.amazonaws.services.lambda.model.PublishVersionResult;
import com.amazonaws.services.lambda.model.UpdateFunctionCodeRequest;
import com.amazonaws.services.lambda.model.UpdateFunctionCodeResult;
import com.amazonaws.services.lambda.model.UpdateFunctionConfigurationRequest;
import com.amazonaws.services.lambda.model.UpdateFunctionConfigurationResult;

/**
 * @author Shane Witbeck
 * @since 7/17/16
 */
public interface LambdaService {

  PublishVersionResult publish(PublishVersionRequest publishVersionRequest);

  GetFunctionResult getFunction(String functionName);

  CreateFunctionResult saveFunctionConfiguration(FunctionConfiguration functionConfiguration);

  UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest request);

  UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest);

  FunctionConfiguration deleteFunction(String arn);

  ListFunctionsResult listFunctions();

  CreateEventSourceMappingResult saveEventSourceMapping(CreateEventSourceMappingRequest request);

  Object invokeFunction(InvokeRequest invokeRequest, FunctionConfiguration functionConfiguration,
                        FunctionCodeLocation functionCodeLocation);

}
