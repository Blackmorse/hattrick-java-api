# hattrick-java-api
Java library for Hattrick developers!

Wrapper for CHPP requests to Hattrick API

Usage:

```
HattrickApi hattrickApi = new HattrickApi(<customerKey>, <customerSecret>,
                       <accessToken>, <accessTokenSecret>);

 WorldDetails worldDetails = hattrickApi.worldDetails().execute()
```

Builders for passing parameters:
```
 HattrickApi matchLineUp = apiExecutor.matchLineUp().matchId(<match_id>).teamId(<team_id>).execute();
```

At the current point, supported only few 'files', feel free to add more, or to ask me to do so :)

Also feel free for contacting with me: blackmorse@live.com
