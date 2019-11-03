package com.fola.web;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ResourceController
 */
@RestController
public class ResourceController {

  @PostMapping("/")
  @ResponseBody
  public ResponseEntity<Resource> getResource(@Valid @RequestBody AccountInfo accountInfo) {
    System.out.println("Resource: getResource()");
    Resource r = new Resource(accountInfo.getLocation(), accountInfo.getOwner(), UUID.randomUUID());
    return new ResponseEntity<Resource>(r, HttpStatus.OK);
  }
}
