package com.thank.cuttlefish.content.mapper;

import com.thank.cuttlefish.common.utils.MyMapper;
import com.thank.cuttlefish.content.dto.ContentDto;
import com.thank.cuttlefish.content.pojo.Content;

import java.util.List;

public interface ContentMapper extends MyMapper<Content> {
    List<ContentDto> queryListByRand(ContentDto contentDto);

}