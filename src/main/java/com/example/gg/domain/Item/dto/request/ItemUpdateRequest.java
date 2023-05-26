package com.example.gg.domain.Item.dto.request;

import com.example.gg.domain.Item.entity.Item;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ItemUpdateRequest {
    Long memberId;
    String title;
    String url;
    int starCount;

    public Item toDto(ItemUpdateRequest dto) {
        return new Item(dto.getMemberId(),
                dto.getTitle(), dto.getUrl(), dto.getStarCount());
    }
}
