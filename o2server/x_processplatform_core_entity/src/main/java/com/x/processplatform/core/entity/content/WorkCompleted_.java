/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.content.WorkCompleted.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Dec 23 12:00:00 CST 2018")
public class WorkCompleted_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<WorkCompleted,String> application;
    public static volatile SingularAttribute<WorkCompleted,String> applicationAlias;
    public static volatile SingularAttribute<WorkCompleted,String> applicationName;
    public static volatile SingularAttribute<WorkCompleted,Date> completedTime;
    public static volatile SingularAttribute<WorkCompleted,String> completedTimeMonth;
    public static volatile SingularAttribute<WorkCompleted,String> creatorIdentity;
    public static volatile SingularAttribute<WorkCompleted,String> creatorPerson;
    public static volatile SingularAttribute<WorkCompleted,String> creatorUnit;
    public static volatile SingularAttribute<WorkCompleted,String> creatorUnitLevelName;
    public static volatile SingularAttribute<WorkCompleted,Long> duration;
    public static volatile SingularAttribute<WorkCompleted,Date> expireTime;
    public static volatile SingularAttribute<WorkCompleted,Boolean> expired;
    public static volatile SingularAttribute<WorkCompleted,String> form;
    public static volatile SingularAttribute<WorkCompleted,String> formData;
    public static volatile SingularAttribute<WorkCompleted,String> formMobileData;
    public static volatile SingularAttribute<WorkCompleted,String> id;
    public static volatile SingularAttribute<WorkCompleted,String> job;
    public static volatile SingularAttribute<WorkCompleted,String> process;
    public static volatile SingularAttribute<WorkCompleted,String> processAlias;
    public static volatile SingularAttribute<WorkCompleted,String> processName;
    public static volatile SingularAttribute<WorkCompleted,String> serial;
    public static volatile SingularAttribute<WorkCompleted,Date> startTime;
    public static volatile SingularAttribute<WorkCompleted,String> startTimeMonth;
    public static volatile SingularAttribute<WorkCompleted,String> title;
    public static volatile SingularAttribute<WorkCompleted,String> work;
}
