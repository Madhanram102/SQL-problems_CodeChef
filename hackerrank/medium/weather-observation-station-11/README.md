# Weather Observation Station 10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the list of *CITY* names from **STATION** that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.

**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude. 

**Output Format**

## Solution

**Language:** db2  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T13:45:16.399Z  

```db2
SELECT DISTINCT CITY FROM STATION WHERE
 CITY NOT LIKE '%a' AND CITY NOT  LIKE '%e' AND CITY  NOT  LIKE  '%i' AND
 CITY NOT LIKE '%o' AND CITY NOT LIKE '%u'; 

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-11/problem)