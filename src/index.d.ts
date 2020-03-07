// TypeScript typings.

/**
 * Static ConvertDate attributes.
 */
export interface ConvertDateStatic {
	timeStamp: string;

	dateFormat?: string;

	convertTimestamp(timeStamp, dateFormat): any;
}

declare const ConvertDate: ConvertDateStatic;
export default ConvertDate;
