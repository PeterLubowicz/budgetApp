package com.salem.budgetApp.controllers;

import com.salem.budgetApp.services.SuggestedAssetsService;
import com.salem.budgetApp.services.dtos.AssetDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suggest")
@AllArgsConstructor
public class SuggestedAssetsController {

    private final SuggestedAssetsService suggestedAssetsService;

    @GetMapping
    public List<AssetDto> getAllSuggestedAssets(){
        return suggestedAssetsService.getAllRentRooms();
    }

}
