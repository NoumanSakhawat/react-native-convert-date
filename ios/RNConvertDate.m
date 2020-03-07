//
//  RNConvertDate.m
//  RN_Date_to_Timestamp
//
//  Created by Nouman Sakhawat on 07/03/2020.
//  Copyright © 2020 Facebook. All rights reserved.
//


#import "RNConvertDate.h"
#import <Foundation/Foundation.h>

@implementation RNConvertDate

RCT_EXPORT_MODULE();

RCT_REMAP_METHOD(convertToDate, timeStamp:(NSString * )timeStampString dateFormat:(NSString *)dateFormat resolver: (RCTPromiseResolveBlock)resolve
     rejecter:(RCTPromiseRejectBlock)reject)
{

 double timeStamp = timeStampString;

  NSTimeInterval timeInterval= timeStamp/1000;

  NSDate *date1 =[NSDate dateWithTimeIntervalSince1970: timeInterval];

  NSDateFormatter *dateformatter=[[NSDateFormatter alloc]init];

  [dateformatter setDateFormat: dateFormat];

  NSString *dateString=[dateformatter stringFromDate:date1];
  resolve(dateString);
  return dateString;

}

@end
