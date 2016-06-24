package io.swagger.handler;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import io.swagger.model.*;

import io.swagger.model.Correlation;
import io.swagger.model.JsonErrorResponse;
import io.swagger.model.PostCorrelation;
import io.swagger.model.ConnectorInstruction;
import io.swagger.model.ConnectorInfo;
import io.swagger.model.Connector;
import io.swagger.model.MeasurementSource;
import io.swagger.model.Measurement;
import io.swagger.model.MeasurementDelete;
import io.swagger.model.CommonResponse;
import io.swagger.model.MeasurementSet;
import io.swagger.model.MeasurementRange;
import io.swagger.model.UserTokenRequest;
import io.swagger.model.UserTokenSuccessfulResponse;
import io.swagger.model.UserTokenFailedResponse;
import io.swagger.model.Pairs;
import io.swagger.model.Variable;
import io.swagger.model.InlineResponse200;
import io.swagger.model.TrackingReminderNotificationSkip;
import io.swagger.model.TrackingReminderNotificationSnooze;
import io.swagger.model.TrackingReminderNotificationTrack;
import io.swagger.model.TrackingReminderDelete;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.TrackingReminder;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.UnitCategory;
import io.swagger.model.Unit;
import io.swagger.model.User;
import io.swagger.model.UserTag;
import io.swagger.model.UserVariables;
import io.swagger.model.VariableCategory;
import io.swagger.model.VariablesNew;
import io.swagger.model.VoteDelete;
import io.swagger.model.PostVote;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2016-06-24T22:09:50.540Z")
public class V1Controller  {
  /** 
   * Uncomment and implement as you see fit.  These operations will map
   * Direclty to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext v1AggregatedCorrelationsGet(RequestContext request , String accessToken, String effect, String cause, String correlationCoefficient, String onsetDelay, String durationOfAction, String lastUpdated, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1AggregatedCorrelationsPost(RequestContext request , PostCorrelation body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectJsGet(RequestContext request , String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectMobileGet(RequestContext request , String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsConnectorConnectGet(RequestContext request , String connector, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsConnectorConnectInstructionsGet(RequestContext request , String connector, String parameters, String url, Boolean usePopup, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsConnectorConnectParameterGet(RequestContext request , String connector, String displayName, String key, String placeholder, String type, Boolean usePopup, String accessToken, String defaultValue) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsConnectorDisconnectGet(RequestContext request , String connector) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsConnectorInfoGet(RequestContext request , String connector, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsConnectorUpdateGet(RequestContext request , String connector, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1ConnectorsListGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1CorrelationsGet(RequestContext request , String accessToken, String effect, String cause, String correlationCoefficient, String onsetDelay, String durationOfAction, String lastUpdated, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementSourcesGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementSourcesPost(RequestContext request , MeasurementSource body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementsDailyGet(RequestContext request , String variableName, String accessToken, String abbreviatedUnitName, String startTime, String endTime, Integer groupingWidth, String groupingTimezone, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementsDeletePost(RequestContext request , MeasurementDelete body) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementsGet(RequestContext request , String accessToken, String variableName, String variableCategoryName, String source, String value, String lastUpdated, String unit, String startTime, String createdAt, String updatedAt, String endTime, Integer groupingWidth, String groupingTimezone, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementsPost(RequestContext request , MeasurementSet body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1MeasurementsRangeGet(RequestContext request , String sources, Integer user) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1OrganizationsOrganizationIdUsersPost(RequestContext request , Integer organizationId, UserTokenRequest body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1OrganizationsOrganizationIdUsersPost(RequestContext request , Integer organizationId, UserTokenRequest body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(RequestContext request , Integer organizationId, Integer userId, String variableName, String organizationToken, String accessToken, String includePublic) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(RequestContext request , Integer organizationId, Integer userId, String variableName, String organizationToken, String accessToken, String includePublic) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1PairsCsvGet(RequestContext request , String cause, String effect, String accessToken, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1PairsGet(RequestContext request , String cause, String effect, String accessToken, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1PublicCorrelationsSearchSearchGet(RequestContext request , String search, String effectOrCause, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1PublicVariablesGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1PublicVariablesSearchSearchGet(RequestContext request , String search, String accessToken, String categoryName, String source, String effectOrCause, String publicEffectOrCause, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingReminderNotificationsGet(RequestContext request , String accessToken, String variableCategoryName, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingReminderNotificationsSkipPost(RequestContext request , TrackingReminderNotificationSkip body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingReminderNotificationsSnoozePost(RequestContext request , TrackingReminderNotificationSnooze body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingReminderNotificationsTrackPost(RequestContext request , TrackingReminderNotificationTrack body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingRemindersDeletePost(RequestContext request , TrackingReminderDelete body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingRemindersGet(RequestContext request , String accessToken, String variableCategoryName, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1TrackingRemindersPost(RequestContext request , String accessToken, TrackingReminder body) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UnitCategoriesGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UnitsGet(RequestContext request , String accessToken, Integer id, String unitName, String abbreviatedUnitName, String categoryName) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UnitsVariableGet(RequestContext request , String accessToken, String unitName, String abbreviatedUnitName, String categoryName, String variable) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UserMeGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UserTagsDeletePost(RequestContext request , Integer taggedVariableId, Integer tagVariableId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UserTagsPost(RequestContext request , UserTag body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1UserVariablesPost(RequestContext request , UserVariables userVariables) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariableCategoriesGet(RequestContext request ) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesGet(RequestContext request , String accessToken, Integer id, Integer userId, String category, String name, String lastUpdated, String source, String latestMeasurementTime, String numberOfMeasurements, String lastSource, Integer limit, Integer offset, Integer sort) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesPost(RequestContext request , VariablesNew body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesSearchSearchGet(RequestContext request , String search, String accessToken, String categoryName, Boolean includePublic, Boolean manualTracking, String source, String effectOrCause, String publicEffectOrCause, Integer limit, Integer offset) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesVariableNameCausesGet(RequestContext request , String variableName) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesVariableNameEffectsGet(RequestContext request , String variableName, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesVariableNameGet(RequestContext request , String variableName, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesVariableNamePublicCausesGet(RequestContext request , String variableName, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VariablesVariableNamePublicEffectsGet(RequestContext request , String variableName, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VotesDeletePost(RequestContext request , VoteDelete body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VotesDeletePost(RequestContext request , VoteDelete body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VotesPost(RequestContext request , PostVote body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext v1VotesPost(RequestContext request , PostVote body, String accessToken) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}

