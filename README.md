# react-native-dns-lookup

![Community Supported](https://img.shields.io/badge/Support%20Level-Community%20Supported-457387.svg)

A React Native module that leverages iOS and Android native networking libraries to lookup all of the IP addresses associated with a hostname

## Usage
```javascript
import { getIpAddressesForHostname } from 'react-native-dns-lookup';

// For a given hostname, returns a promise that resolves with an array of strings
// containing all of the ip addresses associated with the hostname.
getIpAddressesForHostname("github.com").then(ipAddresses => console.log(ipAddresses));

// Output: ["192.30.255.112", "192.30.255.113"]
```

## Installation
``` bash
$ npm install react-native-dns-lookup --save
```

or

``` bash
$ yarn add react-native-dns-lookup --save
```

## Automatic Linking

``` bash
$ react-native link react-native-dns-lookup
```

<details>
  <summary>If automatic linking fails, you may need to do manual linking...</summary>

## Manual Linking

### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-dns-lookup` and add `RNDnsLookup.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNDnsLookup.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)

### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNDnsLookupPackage;` to the imports at the top of the file
  - Add `new RNDnsLookupPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-dns-lookup'
  	project(':react-native-dns-lookup').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-dns-lookup/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-dns-lookup')
  	```
</details>

# Contributions

Code contributions and improvements by the community are welcomed!
See the LICENSE file for current open-source licensing and use information.

Before we can accept pull requests from contributors, we require a signed [Contributor License Agreement (CLA)](http://tableau.github.io/contributing.html),
