package com.salesforce.glassdemo;

public class Constants {
    public static final String TAG = "SalesforceGlassDemo";

    public static final String CLIENT_ID = "3MVG9Y6d_Btp4xp4IkYa1658jI8GsM3nHsfbIi1hO_nWeSZlzG8GT_lkUE4aI9QnLgv.tnhtqd5RzFz_5h1EE";
    public static final String CLIENT_SECRET = "1975249502879096133";

    public static final String ADDRESS__C = "Address__c";
    public static final String ID = "Id";
    public static final String LOCATION__C = "Location__c";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String INSPECTIONS__R = "Inspections__r";
    public static final String NULL = "null";
    public static final String RECORDS = "records";
    public static final String INSPECTIONS_R = "Inspections__r";
    public static final String NAME = "Name";
    public static final String INSPECTION_ITEMS__R = "Inspection_Items__r";
    public static final String QUESTION__C = "Question__c";
    public static final String TYPE__C = "Type__c";
    public static final String REQUIRED__C = "Required__c";
    public static final String PHOTO__C = "Photo__c";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String INSTANCE_URL = "instance_url";

    /**
     * Range to use when querying Salesforce for nearby inspection sites
     */
    public static final double DISTANCE_MILES = 10;

    // TODO rename from tag to something else.
    public static final String TAG_PREFERENCES = "preferences";
    public static final String TAG_ACCESS_TOKEN = "ya29.dQA9xfmmZrrRiCEAAAAtppkOBpIu-Ml6Dh1uunZTBq50ojkslxeU2yfOQva-6s9Id5AY77bAS-y1IuUqVMw";
    public static final String TAG_REFRESH_TOKEN = "1/7zeE9epX1eh19yf7t6WFoFeDDxaVKu_UojB0mrbn9sY";
    public static final String TAG_INSTANCE_URL = "https://ap1.salesforce.com";

    public static final String SALESFORCE_INSTANCE_URL = "https://ap1.salesforce.com";

    public class InspectionTypes {
        public static final String TYPE_AFFIRMATIVE_NEGATIVE = "Affirmative/Negative";
        public static final String TYPE_SUCCESS_FAILURE = "Success/Failure";
        public static final String TYPE_TEXT = "Text";
        public static final String TYPE_NUMBER = "Number";
    }
}
