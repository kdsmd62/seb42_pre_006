package com.pre006.stackoverflow.question.utils;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class UriCreator {
    public static URI createUri(String defaultUrl, long resourceId) {
        return UriComponentsBuilder
                .newInstance()
                .path(defaultUrl + "/{resource-id}")
                .buildAndExpand(resourceId)
                .toUri();
    }

    public static URI createUri(String defaultUrl, long questionId, long questionVoteId) {
        return UriComponentsBuilder
                .newInstance()
                .path(defaultUrl + "/{question-id}/vote/{question-vote-id}")
                .buildAndExpand(questionId, questionVoteId)
                .toUri();
    }

    public static URI createUri(String tagName) {
        return UriComponentsBuilder
                .newInstance()
                .path("/questions/tagged/{tag-name}")
                .buildAndExpand(tagName)
                .toUri();
    }


}