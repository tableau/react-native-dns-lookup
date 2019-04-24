
import { NativeModules } from 'react-native';

const { RNDnsLookup } = NativeModules;

export function getIpAddressesForHostname(hostname) {
  return RNDnsLookup.getIpAddresses(hostname);
}
