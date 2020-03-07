// @flow

import { NativeModules, Platform } from 'react-native';
import IConvertDate from './index';
import ConvertDateAndroid from './ConvertDate';

type IConvertDate = {
	timeStamp: string,

	dateFormat?: string,

	convertTimestamp(timeStamp, dateFormat): any,
};

let date = new Date().getTime();

const ConvertDate: IConvertDate = {
	timeStamp: date.toString(),
	dateFormat: 'YYYY.MM.DD',

	convertTimestamp(timeStamp, dateFormat) {
		if (Platform.OS === 'ios') {
			var convertDateIOS = NativeModules.ConvertDate;
			convertDateIOS.convertToDate(timeStamp, dateFormat).then(res => {
				return res.toString();
			});
		}

		if (Platform.OS === 'android') {
			ConvertDateAndroid.convertToDate(timeStamp, dateFormat).then(res => {
				console.warn('DATE', res);
				return res.toString();
			});
		}
	},
};

export default ConvertDate;
