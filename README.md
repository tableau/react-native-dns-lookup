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

# Contributions

Code contributions and improvements by the community are welcomed!
See the LICENSE file for current open-source licensing and use information.

Before we can accept pull requests from contributors, we require a signed [Contributor License Agreement (CLA)](http://tableau.github.io/contributing.html),
