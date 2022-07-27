import { TestBed } from '@angular/core/testing';

import { UserEdgeService } from './user-edge.service';

describe('UserEdgeService', () => {
  let service: UserEdgeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserEdgeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
